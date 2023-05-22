package com.jenkov;

import software.amazon.awscdk.services.s3.Bucket;
import software.amazon.awscdk.services.s3.BucketEncryption;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class CdkJavaStack extends Stack {
    public CdkJavaStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CdkJavaStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here

        // example resource
        // final Queue queue = Queue.Builder.create(this, "CdkJavaQueue")
        //         .visibilityTimeout(Duration.seconds(300))
        //         .build();


        Bucket bucket = Bucket.Builder.create(this, "CDKMadeBucket")
                .versioned(false)
                .encryption(BucketEncryption.S3_MANAGED)
                .build();


    }
}
