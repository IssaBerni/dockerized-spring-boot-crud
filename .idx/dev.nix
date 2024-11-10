{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "stable-23.11"; # or "unstable"
  
  # Use https://search.nixos.org/packages to find packages
  packages = [
    pkgs.zulu17
    pkgs.maven
  ];

  # Enable Docker service
  services = {
    docker = {
      enable = true;
    };
  };

  # Sets environment variables in the workspace
  env = {};

  idx = {
    # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
    extensions = [
      "vscjava.vscode-java-pack"
      "rangav.vscode-thunder-client"
    ];
    
    workspace = {
      # Runs when a workspace is first created with this `dev.nix` file
      onCreate = {
        install = "mvn clean install";
      };
      
      # Runs when a workspace is (re)started
      onStart = {
        run-server = "PORT=3000 mvn spring-boot:run";
      };
    };
  };
}
