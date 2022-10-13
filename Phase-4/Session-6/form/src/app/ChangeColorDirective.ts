import {Directive,ElementRef} from '@angular/core'

@Directive({selector:'[ChangeColor]'})
export class ChangeColorDirective {
    constructor(er:ElementRef){
        er.nativeElement.style.color="green";
    }
}