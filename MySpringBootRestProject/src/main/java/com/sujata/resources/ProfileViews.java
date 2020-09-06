package com.sujata.resources;

public class ProfileViews {

	public interface ClientView{}
	public interface GlobalView extends ClientView {}
	public interface MoreGlobalView extends GlobalView{}

}

