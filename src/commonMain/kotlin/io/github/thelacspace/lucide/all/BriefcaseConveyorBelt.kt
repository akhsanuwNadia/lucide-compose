package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BriefcaseConveyorBelt") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,20.0)
                lineTo(10.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,20.0)
                lineTo(14.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,20.0)
                lineTo(18.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,20.0)
                lineTo(3.0,20.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,20.0)
                lineTo(6.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,16.0)
                lineTo(8.0,4.0)
                curveTo(8.0,2.895430564880371,8.895430564880371,2.0,10.0,2.0)
                lineTo(14.0,2.0)
                curveTo(15.104569435119629,2.0,16.0,2.895430564880371,16.0,4.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(18.0,6.0)
                lineTo(20.0,6.0)
                lineTo(20.0,16.0)
                lineTo(18.0,16.0)
                lineTo(6.0,16.0)
                lineTo(4.0,16.0)
                lineTo(4.0,6.0)
                lineTo(6.0,6.0)
                close()
            }
}

public val LucideIcons.All.BriefcaseConveyorBeltDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BriefcaseConveyorBelt: ImageVector
    @Composable get() = BriefcaseConveyorBeltDefinition.asImageVector()
