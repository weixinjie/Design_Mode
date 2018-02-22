package com.weixinjie.adapter_pattern;

public class FishingAdaper implements RowingBoat {
    FishingBoat fishingBoat = null;

    public FishingAdaper(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
