class Solution {
public:
    double maxVolume(int p, int a) {

        double discriminant = 1.0 * p * p - 24.0 * a;

        double l = (p - sqrt(discriminant)) / 12.0;

        double h = (p / 4.0) - 2.0 * l;

        return l * l * h;
    }
};