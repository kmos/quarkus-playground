package io.quarkiverse.quarkus.echo.deployment;

import io.quarkiverse.quarkus.echo.runtime.EchoService;
import io.quarkus.arc.deployment.AdditionalBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class EchoProcessor {

    private static final String FEATURE = "echo";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    AdditionalBeanBuildItem addEchoService() {
        return AdditionalBeanBuildItem.unremovableOf(EchoService.class);
    }
}
