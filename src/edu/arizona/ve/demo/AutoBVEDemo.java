package edu.arizona.ve.demo;

import edu.arizona.ve.api.AutoEngine;
import edu.arizona.ve.api.Segmentation;
import edu.arizona.ve.corpus.Corpus;
import edu.arizona.ve.corpus.Corpus.CorpusType;
import edu.arizona.ve.evaluation.EvaluationResults;
import edu.arizona.ve.evaluation.Evaluator;

public class AutoBVEDemo {

	/** 
	 * A simple example of how to use the latest version of BVE with automatic parameter setting.
	 * Because it checks many possible parameter settings, execution may take some time.
	 * @param args
	 */
	public static void main(String[] args) {
		// Load the corpus 
		Corpus corpus = Corpus.autoLoad("br87-cmu", CorpusType.LETTER, true);
//		Corpus corpus = Corpus.autoLoad("orwell-font1", CorpusType.WORD, true);

		// Segment using BVE with MDL (self-setting parameters)
		Segmentation segmentation = AutoEngine.autoBVE(corpus);
		
		// Evaluate (compute precision, recall, F-measure, etc.) 
		EvaluationResults results = Evaluator.evaluate(segmentation, corpus);
		
		// Print the important evaluation metrics
		results.printResults();
	}

}