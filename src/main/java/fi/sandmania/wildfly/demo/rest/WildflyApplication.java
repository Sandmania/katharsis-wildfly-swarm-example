package fi.sandmania.wildfly.demo.rest;

import io.katharsis.rs.KatharsisFeature;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class WildflyApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<>();
		set.add(HelloWorldEndpoint.class);
		set.add(KatharsisFeature.class);
		return set;
	}
}