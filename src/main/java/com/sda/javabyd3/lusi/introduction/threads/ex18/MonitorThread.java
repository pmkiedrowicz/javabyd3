package com.sda.javabyd3.lusi.introduction.threads.ex18;

public class MonitorThread implements Runnable {
	private NameStorage storage;
	private boolean isWorking;

	public MonitorThread(NameStorage storage) {
		this.storage = storage;
		this.isWorking = true;
	}

	@Override
	public void run() {
		String previousName = "";
		try {
			while (isWorking) {
				if (!previousName.equals(storage.getName())) {
					System.out.println(String.format("Stare imię: %s, nowe imię: %s", previousName, storage.getName()));
					previousName = storage.getName();
				}
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void setWorking(boolean working) {
		isWorking = working;
	}
}
