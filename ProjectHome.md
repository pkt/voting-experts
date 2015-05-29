## Overview ##

This project provides simple implementations of several algorithms for chunking/segmenting sequences of symbols. The Voting Experts (VE) algorithm is included, as well as algorithms derived from VE such as Bootstrap Voting Experts (BVE) and Voting Experts - Minimum Description Length (VE-MDL). Voting Experts greedily searches for sequences that match an information-theoretic signature: low entropy internally and high entropy at the boundaries. For an up-to-date summary of many VE results and an analysis of VE's chunk signature, see (1).

Voting Experts was originally designed by [Paul Cohen](http://www.cs.arizona.edu/~cohen/) and [Niall Adams](http://www3.imperial.ac.uk/people/n.adams) in 2001. The current Java implementation was developed by [Daniel Hewlett](http://www.cs.arizona.edu/~dhewlett/) with contributions from Nik Sharp, and is based in part on earlier development by [Wesley Kerr](http://www.cs.arizona.edu/~wkerr/). Funding for Voting Experts research has been provided by the National Science Foundation (NSF) and the Defense Advanced Research Projects Agency (DARPA).

## Algorithms Implemented ##

Voting Experts
  * Voting Experts (VE) - The original algorithm, see (5, 7).
  * Bootstrap Voting Experts (BVE) - VE plus the Knowledge Expert, see (2).
  * VE-MDL - VE with automatic parameter setting through MDL, see (2).
  * BVE-MDL - BVE with automatic parameter setting through MDL.

Other Algorithms
  * Model-Based Dynamic Programming 1 (MBDP-1) - Incremental segmentation algorithm of (Brent, 1999)
  * Phoneme to Morpheme (PtM) - Segmentation algorithm based on changes in boundary entropy (Tanaka-Ishii and Jin, 2006)

## Related Publications ##

  1. Daniel Hewlett and Paul Cohen. [Fully Unsupervised Word Segmentation with BVE and MDL](http://www.aclweb.org/anthology-new/P/P11/P11-2095.pdf). Proceedings of The 49th Annual Meeting of the Association for Computational Linguistics: Human Language Technologies (ACL-2011). 2011.
  1. Daniel Hewlett and Paul Cohen. Word Segmentation as General Chunking. Proceedings of the Fifteenth Conference on Computational Natural Language Learning (CoNLL-2011). 2011.
  1. Daniel Hewlett and Paul Cohen. [Artificial General Segmentation](http://dl.dropbox.com/u/2587300/agi-10.pdf). Proceedings of The Third Conference on Artificial General Intelligence (AGI-10). 2010.
  1. Daniel Hewlett and Paul Cohen. [Bootstrap Voting Experts](http://ijcai.org/papers09/Papers/IJCAI09-181.pdf). Proceedings of the Twenty-first International Joint Conference on Artificial Intelligence (IJCAI). 2009.
  1. Matthew Miller, Peter Wong, and Alexander Stoytchev. [Unsupervised Segmentation of Audio Speech Using the Voting Experts Algorithm](http://agi-conf.org/2009/papers/paper_43.pdf). Proceedings of the Second Conference on Artificial General Intelligence (AGI). 2009.
  1. Matthew Miller and Alexander Stoytchev. [Hierarchical Voting Experts: An Unsupervised Algorithm for Hierarchical Sequence Segmentation](http://www.aaai.org/Papers/AAAI/2008/AAAI08-300.pdf). Proceedings of the 7th IEEE International Conference on Development and Learning (ICDL). (Best Paper Award, ICDL 2008)
  1. Paul R. Cohen,  Niall Adams, Brent Heeringa.  [Voting Experts:  An Unsupervised Algorithm for Segmenting Sequences](http://www.cs.arizona.edu/~cohen/Publications/papers/voting-experts.pdf).  To appear in Journal of Intelligent Data Analysis. 2007.
  1. Jimming Cheng and Michael Mitzenmacher. [Markov Experts](http://www.eecs.harvard.edu/~michaelm/postscripts/jsubmit.pdf). Proceedings of the Data Compression Conference (DCC). 2005.
  1. Paul R. Cohen and Niall Adams. [An Algorithm for Segmenting Categorical Time Series into Meaningful Episodes](http://www.cs.arizona.edu/~cohen/Publications/papers/cohen_ida01.pdf). Proceedings of the Fourth Symposium on Intelligent Data Analysis, Lecture Notes in Computer Science. 2001.