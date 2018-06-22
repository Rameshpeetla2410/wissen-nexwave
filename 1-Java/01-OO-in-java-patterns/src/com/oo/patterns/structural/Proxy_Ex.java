package com.oo.patterns.structural;

class Security {
	public void doSec() {
		System.out.println("sec..");
	}
}

class Logging {
	public void doLog() {
		System.out.println("log..");
	}
}
// -------------------------------------------
//
//class NexWave {
//	Security security = new Security();
//	Logging logging = new Logging();
//
//	public void getTraining() {
//		security.doSec();
//		logging.doLog();
//		System.out.println("tng..........");
//		logging.doLog();
//	}
// }
// -------------------------------------------

class NexWave {
	public void getTraining() {
		System.out.println("tng..........");
	}
}
// ----------------------------------------------

class NexWaveProxy extends NexWave {

	Security security = new Security();
	Logging logging = new Logging();
	NexWave nexWave = new NexWave();

	@Override
	public void getTraining() {
		security.doSec();
		logging.doLog();
		// super.getTraining();
		nexWave.getTraining();
		logging.doLog();
	}
}

//----------------------------------------------

public class Proxy_Ex {

	public static void main(String[] args) {

		NexWaveProxy nexWaveProxy = new NexWaveProxy();
		nexWaveProxy.getTraining();

	}

}
