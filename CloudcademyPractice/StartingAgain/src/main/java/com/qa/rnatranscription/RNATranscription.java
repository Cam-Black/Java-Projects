package com.qa.rnatranscription;

class RNATranscription {
	public String transcribe(String dnaStrand) {
		
		String transcribedDNA = "";
		String[] dnaArr = dnaStrand.split("");
		for (int i = 0; i < dnaArr.length; i++) {
			switch (dnaArr[i]) {
				case "":
					return "";
				case "G":
					transcribedDNA += "C";
					break;
				case "C":
					transcribedDNA += "G";
					break;
				case "T":
					transcribedDNA += "A";
					break;
				case "A":
					transcribedDNA += "U";
					break;
				default:
					transcribedDNA += dnaArr[i];
					break;
			}
		}
		return transcribedDNA;
	}
}
