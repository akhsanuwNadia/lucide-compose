package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Boxes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.9700000286102295,12.920000076293945)
                curveTo(2.369497537612915,13.280779838562012,2.001535415649414,13.929455757141113,2.0,14.630000114440918)
                lineTo(2.0,17.8700008392334)
                curveTo(2.001534938812256,18.570545196533203,2.369497299194336,19.219221115112305,2.9700000286102295,19.580001831054688)
                lineTo(5.970000267028809,21.380001068115234)
                curveTo(6.603865146636963,21.760828018188477,7.3961358070373535,21.760828018188477,8.030000686645508,21.380001068115234)
                lineTo(12.0,19.0)
                lineTo(12.0,13.5)
                lineTo(7.0,10.5)
                lineTo(2.9699997901916504,12.920000076293945)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.5)
                lineTo(2.260000228881836,13.649999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.5)
                lineTo(12.0,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,16.5)
                lineTo(7.0,21.670000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,13.5)
                lineTo(12.0,19.0)
                lineTo(15.970000267028809,21.380001068115234)
                curveTo(16.603864669799805,21.760828018188477,17.396135330200195,21.760828018188477,18.030000686645508,21.380001068115234)
                lineTo(21.030000686645508,19.580001831054688)
                curveTo(21.630502700805664,19.219223022460938,21.998464584350586,18.570547103881836,22.0,17.87000274658203)
                lineTo(22.0,14.630002975463867)
                curveTo(21.998464584350586,13.929458618164062,21.630502700805664,13.280782699584961,21.030000686645508,12.920002937316895)
                lineTo(17.0,10.5)
                lineTo(12.0,13.5)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.5)
                lineTo(12.0,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.5)
                lineTo(21.739999771118164,13.649999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,16.5)
                lineTo(17.0,21.670000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(7.96999979019165,4.420000076293945)
                curveTo(7.369497299194336,4.780779838562012,7.001535415649414,5.429455757141113,7.0,6.130000114440918)
                lineTo(7.0,10.5)
                lineTo(12.0,13.5)
                lineTo(17.0,10.5)
                lineTo(17.0,6.130000114440918)
                curveTo(16.998464584350586,5.429455757141113,16.630502700805664,4.780779838562012,16.030000686645508,4.420000076293945)
                lineTo(13.030000686645508,2.620000123977661)
                curveTo(12.396136283874512,2.2391741275787354,11.603865623474121,2.2391741275787354,10.970001220703125,2.620000123977661)
                lineTo(7.970001220703125,4.420000076293945)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(7.260000228881836,5.150000095367432)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(16.739999771118164,5.150000095367432)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,13.5)
                lineTo(12.0,8.0)
            }
}

public val LucideIcons.All.BoxesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Boxes: ImageVector
    @Composable get() = BoxesDefinition.asImageVector()
