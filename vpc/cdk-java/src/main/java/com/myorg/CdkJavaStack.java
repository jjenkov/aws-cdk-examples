package com.myorg;

import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
import software.amazon.awscdk.services.apprunner.CfnVpcConnector;
import software.amazon.awscdk.services.ec2.IpAddresses;
import software.amazon.awscdk.services.ec2.SubnetSelection;
import software.amazon.awscdk.services.ec2.Vpc;
import software.amazon.awscdk.services.servicediscovery.Service;
import software.constructs.Construct;

import software.amazon.awscdk.services.ec2.*;


public class CdkJavaStack extends Stack {
    public CdkJavaStack(final Construct parent, final String id) {
        this(parent, id, null);
    }

    public CdkJavaStack(final Construct parent, final String id, final StackProps props) {
        super(parent, id, props);

        Vpc vpc = Vpc.Builder.create(this, "Vpc")
                .ipAddresses(IpAddresses.cidr("10.0.0.0/16"))
                .build();


    }
}
