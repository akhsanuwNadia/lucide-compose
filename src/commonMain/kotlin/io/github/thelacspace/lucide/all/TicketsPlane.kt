package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TicketsPlane") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.5,17.0)
                lineTo(11.72700023651123,17.0)
                curveTo(12.224397659301758,16.99994659423828,12.703927040100098,16.814552307128906,13.072000503540039,16.479999542236328)
                lineTo(18.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,13.5)
                lineTo(15.793999671936035,14.005999565124512)
            }
            lucidePath(strokeWidth) {
                moveTo(3.1730000972747803,8.180000305175781)
                lineTo(14.17300033569336,3.1800003051757812)
                curveTo(15.178176879882812,2.723809242248535,16.362886428833008,3.168243169784546,16.81999969482422,4.173000335693359)
                lineTo(18.559999465942383,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,10.0)
                lineTo(6.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,14.0)
                lineTo(6.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,19.0)
                lineTo(6.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,8.0)
                lineTo(20.0,8.0)
                lineTo(22.0,8.0)
                lineTo(22.0,21.0)
                lineTo(20.0,21.0)
                lineTo(4.0,21.0)
                lineTo(2.0,21.0)
                lineTo(2.0,8.0)
                lineTo(4.0,8.0)
                close()
            }
}

public val LucideIcons.All.TicketsPlaneDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TicketsPlane: ImageVector
    @Composable get() = TicketsPlaneDefinition.asImageVector()
