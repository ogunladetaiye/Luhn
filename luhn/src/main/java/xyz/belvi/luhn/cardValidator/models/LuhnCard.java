package xyz.belvi.luhn.cardValidator.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zone2 on 7/5/17.
 */

public final class LuhnCard implements Parcelable {
    String pan,cardName;
    int expMonth, expYear, cvv, pin;


    public LuhnCard(String pan,String cardName, int expMonth, int expYear, int cvv, int pin) {
        this.pan = pan;
        this.cardName = cardName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
        this.pin = pin;
    }

    protected LuhnCard(Parcel in) {
        pan = in.readString();
        cardName = in.readString();
        expMonth = in.readInt();
        expYear = in.readInt();
        cvv = in.readInt();
        pin = in.readInt();
    }

    public static final Creator<LuhnCard> CREATOR = new Creator<LuhnCard>() {
        @Override
        public LuhnCard createFromParcel(Parcel in) {
            return new LuhnCard(in);
        }

        @Override
        public LuhnCard[] newArray(int size) {
            return new LuhnCard[size];
        }
    };

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        dest.writeString(pan);
        dest.writeString(cardName);
        dest.writeInt(expMonth);
        dest.writeInt(expYear);
        dest.writeInt(cvv);
        dest.writeInt(pin);
    }

    public String getPan() {
        return this.pan;
    }

    public int getExpMonth() {
        return this.expMonth;
    }

    public int getExpYear() {
        return this.expYear;
    }

    public int getCvv() {
        return this.cvv;
    }

    public int getPin() {
        return this.pin;
    }

    public String getCardName() {
        return this.cardName;
    }
}
