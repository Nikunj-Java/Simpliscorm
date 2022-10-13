import {Directive,ElementRef,Renderer2} from '@angular/core'

@Directive({selector:'[HighLightColor]'})
export class HighLightColor {
    constructor(er:ElementRef,render:Renderer2){
        render.setStyle(er.nativeElement,'background-color','aqua')
    }
}