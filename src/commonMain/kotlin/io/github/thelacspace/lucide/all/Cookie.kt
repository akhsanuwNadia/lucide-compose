package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cookie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,17.0)
                lineTo(11.010000228881836,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.496000289916992,2.0)
                curveTo(11.820000648498535,1.9839999675750732,12.053999900817871,2.2920000553131104,12.02500057220459,2.615000009536743)
                curveTo(11.914989471435547,3.780181407928467,12.320798873901367,4.935092926025391,13.135479927062988,5.775358200073242)
                curveTo(13.950160026550293,6.615623474121094,15.091975212097168,7.05694055557251,16.260000228881836,6.982999801635742)
                curveTo(16.464662551879883,6.969637393951416,16.6651668548584,7.045054912567139,16.810287475585938,7.189985275268555)
                curveTo(16.95541000366211,7.334915637969971,17.031091690063477,7.535320281982422,17.01799964904785,7.739999771118164)
                curveTo(16.943527221679688,8.907979011535645,17.38431167602539,10.0499849319458,18.22418975830078,10.8650484085083)
                curveTo(19.064069747924805,11.680110931396484,20.21877670288086,12.086458206176758,21.38399887084961,11.976999282836914)
                curveTo(21.706998825073242,11.946999549865723,22.01399803161621,12.180999755859375,21.99799919128418,12.503999710083008)
                curveTo(21.87318229675293,14.978180885314941,20.834428787231445,17.31795883178711,19.08300018310547,19.06999969482422)
                curveTo(16.55879020690918,21.617067337036133,12.864691734313965,22.618852615356445,9.399497032165527,21.696022033691406)
                curveTo(5.934301853179932,20.773191452026367,3.2277376651763916,18.066818237304688,2.304661989212036,14.601689338684082)
                curveTo(1.3815861940383911,11.13655948638916,2.3831098079681396,7.442389965057373,4.929999828338623,4.918000221252441)
                curveTo(6.681575298309326,3.165469169616699,9.021409034729004,2.125622272491455,11.496000289916992,2.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,12.0)
                lineTo(12.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(16.010000228881836,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,3.0)
                lineTo(16.010000228881836,3.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,4.0)
                lineTo(21.010000228881836,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,8.0)
                lineTo(21.010000228881836,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,14.0)
                lineTo(7.010000228881836,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,8.0)
                lineTo(9.010000228881836,8.0)
            }
}

public val LucideIcons.All.CookieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cookie: ImageVector
    @Composable get() = CookieDefinition.asImageVector()
