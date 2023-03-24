package analysis.analyzers;

import model.protein.Protein;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProteinAnalyzer {
    private List<Protein> proteins;

    public ProteinAnalyzer(List proteins) {
        this.proteins = proteins;
    }

    public Map<String, Integer> findHighCoverageRegions() {
        int count = 1;
        Map<String, Integer> highCoverageRegions = new HashMap<>();

        // High GC content range
        final float MIN_GC_CONTENT = 0.40f;
        final float MAX_GC_CONTENT = 0.60f;

        for (Protein protein : proteins) {
            double gcContent = protein.calculateGCContent();
            if ( (gcContent > MIN_GC_CONTENT) && (gcContent < MAX_GC_CONTENT) ) {
                String proteinSequence = protein.getSequence();
                highCoverageRegions.put(proteinSequence, count);
                count++;
            }
        }

        return highCoverageRegions;
    }

    public Protein findLongestProtein(List<Protein> proteins) {
        Protein longestProtein = new Protein( "");

        for (Protein currentProtein : proteins) {
            if (currentProtein.length() > longestProtein.length())
                longestProtein = currentProtein;
        }

        return longestProtein;
    }
}
