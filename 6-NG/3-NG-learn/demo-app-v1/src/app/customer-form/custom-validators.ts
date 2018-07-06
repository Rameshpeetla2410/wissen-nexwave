import { AbstractControl } from "@angular/forms";
export function myRangeValidator(min, max) {
    return function (c: AbstractControl): { [key: string]: boolean } | null {
        let value = c.value;
        if (value >= min && value <= max) return null;
        if (value < min) return { less: true };
        if (value > max) return { high: true };
    }
}

export function emailCompare(c: AbstractControl): { [key: string]: boolean } | null {
    let emailControl = c.get('email');
    let cemailControl = c.get('cemail');
    if (emailControl.value === cemailControl.value) return null;
    return { 'match': true };

}