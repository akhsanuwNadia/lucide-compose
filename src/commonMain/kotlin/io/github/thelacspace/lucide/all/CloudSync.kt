package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudSync") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,18.0)
                lineTo(15.46500015258789,19.604999542236328)
                curveTo(14.300312042236328,20.724361419677734,12.666584968566895,21.212072372436523,11.078866958618164,20.91437530517578)
                curveTo(9.49114990234375,20.61667823791504,8.145072937011719,19.570255279541016,7.465000152587891,18.104999542236328)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,22.0)
                lineTo(17.0,18.0)
                lineTo(13.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.996000289916992,15.25100040435791)
                curveTo(22.038673400878906,13.901568412780762,22.228975296020508,12.07868766784668,21.487497329711914,10.542996406555176)
                curveTo(20.746021270751953,9.007306098937988,19.20017433166504,8.022688865661621,17.4950008392334,8.0)
                lineTo(15.705000877380371,8.0)
                curveTo(14.928483009338379,5.40328311920166,12.722731590270996,3.488187074661255,10.042725563049316,3.0838510990142822)
                curveTo(7.362720012664795,2.6795151233673096,4.690144062042236,3.8586113452911377,3.1820874214172363,6.110651016235352)
                curveTo(1.6740309000015259,8.362690925598145,1.6015405654907227,11.282909393310547,2.9960012435913086,13.607000350952148)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,10.0)
                lineTo(7.0,14.0)
                lineTo(11.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(8.53499984741211,12.395000457763672)
                curveTo(9.699687957763672,11.275638580322266,11.333415031433105,10.787928581237793,12.921133041381836,11.085625648498535)
                curveTo(14.50885009765625,11.383322715759277,15.854927062988281,12.4297456741333,16.53499984741211,13.895000457763672)
            }
}

public val LucideIcons.All.CloudSyncDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudSync: ImageVector
    @Composable get() = CloudSyncDefinition.asImageVector()
