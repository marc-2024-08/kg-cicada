package com.ibm.app.demo;

import org.eclipse.microprofile.auth.LoginConfig;

import jakarta.annotation.security.DeclareRoles;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 *
 */
@ApplicationPath("/data")

@LoginConfig(authMethod = "MP-JWT", realmName = "jwt-jaspi")
@DeclareRoles({"protected"})

public class DemoRestApplication extends Application {
}
