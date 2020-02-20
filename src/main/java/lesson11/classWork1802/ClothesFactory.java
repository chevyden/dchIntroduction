package lesson11.classWork1802;

import lesson11.model.Clothes;
import lesson11.model.Dress;
import lesson11.model.Shirt;

public class ClothesFactory implements ClothesBasicFunctional, DuplicateClothes {
    private final int DRESS_TYPE = 1;
    private final int SHIRT_TYPE = 2;

    @Override
    public Clothes create(int type) {
        if (type == DRESS_TYPE) {
            return new Dress();
        } else if (type == SHIRT_TYPE) {
            return new Shirt();
        }
        return null;
    }

    @Override
    public void utilization(Clothes clothes) {
        clothes = null;
    }

    @Override
    public Clothes[] createClothes(int type, int value) {
        Clothes[] clothes = new Clothes[value];
        for (int i = 0; i < value; i++) {
            clothes[i] = create(type);
        }
        return clothes;
    }
}