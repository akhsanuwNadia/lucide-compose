package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vegan") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,8.0)
                quadTo(22.0,8.0,22.0,2.0)
                quadTo(16.0,2.0,16.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.40999984741211,3.5899999141693115)
                curveTo(13.11247444152832,0.8254550695419312,7.422045707702637,1.7456247806549072,4.214838027954102,5.723721027374268)
                curveTo(1.0076305866241455,9.701817512512207,1.315524935722351,15.457935333251953,4.928793907165527,19.071205139160156)
                curveTo(8.542062759399414,22.68447494506836,14.298181533813477,22.992368698120117,18.276277542114258,19.7851619720459)
                curveTo(22.25437355041504,16.57795524597168,23.174545288085938,10.88752555847168,20.40999984741211,6.590000152587891)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                curveTo(8.109626770019531,6.87385892868042,11.76668930053711,14.187983512878418,12.0,22.0)
                curveTo(12.899999618530273,15.180000305175781,13.5,12.5,16.0,8.0)
            }
}

public val LucideIcons.All.VeganDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vegan: ImageVector
    @Composable get() = VeganDefinition.asImageVector()
