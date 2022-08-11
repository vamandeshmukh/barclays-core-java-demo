package com.barclays.corejava.demo.structural;

interface ILightningPhone {

	void charging();

	void usePower();
}

interface IMicroUsbPhone {
	void recharge();

	void useMicroUsb();
}

class Iphone implements ILightningPhone {
	private boolean isConnected;

	@Override
	public void usePower() {
		isConnected = true;
		System.out.println("Lightning connected");
	}

	@Override
	public void charging() {
		if (isConnected) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		} else {
			System.out.println("Connect Lightning first");
		}
	}
}

class Android implements IMicroUsbPhone {
	private boolean connector;

	@Override
	public void useMicroUsb() {
		connector = true;
		System.out.println("MicroUsb connected");
	}

	@Override
	public void recharge() {
		if (connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge finished");
		} else {
			System.out.println("Connect MicroUsb first");
		}
	}
}

/* exposing the target interface while wrapping source object */
class LightningToMicroUsbAdapter implements IMicroUsbPhone {
	private final ILightningPhone lightningPhone;

	public LightningToMicroUsbAdapter(ILightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	@Override
	public void useMicroUsb() {
		System.out.println("MicroUsb connected");
		lightningPhone.usePower();
	}

	@Override
	public void recharge() {
		lightningPhone.charging();
	}
}

public class AdapterDemo {

	static void rechargeMicroUsbPhone(IMicroUsbPhone phone) {
		phone.useMicroUsb();
		phone.recharge();
	}

	static void rechargeLightningPhone(ILightningPhone phone) {
		phone.usePower();
		phone.charging();
	}

	public static void main(String[] args) {

		Android android = new Android();
		Iphone iPhone = new Iphone();

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

		System.out.println("Recharging iPhone with MicroUsb");
		rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));
	}
}