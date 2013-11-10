package org.jnario.coffee.features;

import org.jnario.coffee.features.TrackingCoffeeConsumptionFeatureTrackingIndividualCoffeeConsumption;
import org.jnario.coffee.features.TrackingCoffeeConsumptionFeatureTrackingOverallCoffeeConsumption;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ TrackingCoffeeConsumptionFeatureTrackingIndividualCoffeeConsumption.class, TrackingCoffeeConsumptionFeatureTrackingOverallCoffeeConsumption.class })
@Named("Tracking Coffee Consumption")
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class TrackingCoffeeConsumptionFeature {
}
