package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Shapes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.300000190734863,10.0)
                curveTo(8.037150382995605,10.0143461227417,7.7884745597839355,9.880013465881348,7.656373500823975,9.652318000793457)
                curveTo(7.5242719650268555,9.424622535705566,7.531082630157471,9.14206600189209,7.674000263214111,8.920999526977539)
                lineTo(11.399999618530273,3.0)
                curveTo(11.519084930419922,2.785557270050049,11.741727828979492,2.6490917205810547,11.986860275268555,2.6402931213378906)
                curveTo(12.231992721557617,2.6314945220947266,12.463846206665039,2.7516467571258545,12.597999572753906,2.9570000171661377)
                lineTo(16.299999237060547,8.899999618530273)
                curveTo(16.448720932006836,9.113582611083984,16.466670989990234,9.392043113708496,16.34659767150879,9.62295150756836)
                curveTo(16.226526260375977,9.853859901428223,15.988258361816406,9.999088287353516,15.727998733520508,10.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,14.0)
                lineTo(9.0,14.0)
                lineTo(10.0,14.0)
                lineTo(10.0,21.0)
                lineTo(9.0,21.0)
                lineTo(4.0,21.0)
                lineTo(3.0,21.0)
                lineTo(3.0,14.0)
                lineTo(4.0,14.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.5)
                curveTo(13.994391441345215,18.75415802001953,14.660258293151855,19.915454864501953,15.745466232299805,20.544158935546875)
                curveTo(16.830673217773438,21.172863006591797,18.169326782226562,21.172863006591797,19.254533767700195,20.544158935546875)
                curveTo(20.33974266052246,19.915454864501953,21.0056095123291,18.75415802001953,21.0,17.5)
                curveTo(21.0056095123291,16.24584197998047,20.33974266052246,15.08454418182373,19.254533767700195,14.455840110778809)
                curveTo(18.169326782226562,13.827136993408203,16.830673217773438,13.827136993408203,15.745466232299805,14.455840110778809)
                curveTo(14.660258293151855,15.08454418182373,13.994391441345215,16.24584197998047,14.0,17.5)
            }
}

public val LucideIcons.All.ShapesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Shapes: ImageVector
    @Composable get() = ShapesDefinition.asImageVector()
