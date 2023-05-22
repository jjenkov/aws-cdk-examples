package com.myorg;

import software.amazon.awscdk.App;

public final class CdkJavaApp {
    public static void main(final String[] args) {
        App app = new App();

        new CdkJavaStack(app, "CdkJavaStack");

        app.synth();
    }
}
