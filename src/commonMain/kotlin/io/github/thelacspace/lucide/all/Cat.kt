package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,5.0)
                curveTo(12.670000076293945,5.0,13.350000381469727,5.090000152587891,14.0,5.260000228881836)
                curveTo(15.779999732971191,3.260000228881836,19.030000686645508,2.4200003147125244,20.420000076293945,3.000000238418579)
                curveTo(21.81999969482422,3.580000162124634,20.0,10.0,20.0,10.0)
                curveTo(20.56999969482422,11.069999694824219,21.0,12.239999771118164,21.0,13.440000534057617)
                curveTo(21.0,17.899999618530273,16.969999313354492,21.0,12.0,21.0)
                curveTo(7.030000686645508,21.0,3.0,18.0,3.0,13.440000534057617)
                curveTo(3.0,12.190000534057617,3.5,11.040000915527344,4.0,10.0)
                curveTo(4.0,10.0,2.1100001335144043,3.5799999237060547,3.5,3.0)
                curveTo(4.889999866485596,2.4200000762939453,8.219999313354492,3.2300000190734863,10.0,5.230000019073486)
                curveTo(10.656023979187012,5.079108715057373,11.326848983764648,5.0019636154174805,12.0,5.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,14.0)
                lineTo(8.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,14.0)
                lineTo(16.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(11.25,16.25)
                lineTo(12.75,16.25)
                lineTo(12.0,17.0)
                lineTo(11.25,16.25)
                close()
            }
}

public val LucideIcons.All.CatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cat: ImageVector
    @Composable get() = CatDefinition.asImageVector()
