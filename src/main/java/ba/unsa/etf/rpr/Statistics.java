package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Statistics {
    private ArrayList<Double> nums;

    Statistics() {
        this.nums = new ArrayList<>();
    }

    public void add(double element) {
        nums.add(element);
    }

    public Double min() {
        return Collections.min(this.nums);
    }

    public Double max() {
        return Collections.max(this.nums);
    }

    public Double mean() {
        return this.nums.stream().mapToDouble(Double::doubleValue).sum() / this.nums.size();
    }

    public Double standardDeviation() {
        double sum = 0, mean = this.mean();

        for (Double element : this.nums) {
            sum += Math.pow(element - mean, 2);
        }

        return Math.sqrt(sum / this.nums.size());
    }
}
