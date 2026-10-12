package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Baby") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                curveTo(10.5,16.299999237060547,11.199999809265137,16.5,12.0,16.5)
                curveTo(12.800000190734863,16.5,13.5,16.299999237060547,14.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(15.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.3799991607666,6.813000202178955)
                curveTo(20.081104278564453,7.832396030426025,20.56450080871582,8.985398292541504,20.799999237060547,10.199999809265137)
                curveTo(21.489978790283203,10.534173011779785,21.928218841552734,11.233354568481445,21.928218841552734,12.0)
                curveTo(21.928218841552734,12.766644477844238,21.489978790283203,13.465826034545898,20.799999237060547,13.799999237060547)
                curveTo(19.91038703918457,17.94914436340332,16.24344253540039,20.913204193115234,11.999999046325684,20.913204193115234)
                curveTo(7.756555557250977,20.913204193115234,4.089611053466797,17.94914436340332,3.1999988555908203,13.799999237060547)
                curveTo(2.5100178718566895,13.465826034545898,2.0717782974243164,12.766644477844238,2.0717782974243164,11.999999046325684)
                curveTo(2.0717782974243164,11.233353614807129,2.5100178718566895,10.534172058105469,3.1999988555908203,10.19999885559082)
                curveTo(4.0539727210998535,6.016355991363525,7.730097770690918,3.0086183547973633,12.0,3.0)
                curveTo(14.0,3.0,15.5,4.099999904632568,15.5,5.5)
                curveTo(15.5,6.900000095367432,14.600000381469727,8.0,13.5,8.0)
                curveTo(12.699999809265137,8.0,12.0,7.599999904632568,12.0,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.010000228881836,12.0)
            }
}

public val LucideIcons.All.BabyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Baby: ImageVector
    @Composable get() = BabyDefinition.asImageVector()
