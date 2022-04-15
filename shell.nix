{ pkgs ? import <nixpkgs> { } }:

let
  setting = builtins.toJSON {
    folders = [
      {
        path = ".";
      }
    ];
    settings = {
      "nixEnvSelector.nixFile" = "\$\{workspaceRoot\}/shell.nix";
      "java.format.settings.url" = "https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml";
      "java.format.settings.profile" = "GoogleStyle";
      "java.jdt.ls.java.home" = "${pkgs.buildPackages.openjdk11.outPath}/lib/openjdk";
    };
  };
in
pkgs.mkShell
{
  nativeBuildInputs = [ pkgs.buildPackages.openjdk11 pkgs.zip ];
  shellHook = ''
    echo '${setting}' > ./itp1_java.code-workspace
  '';
}