package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorClosedLocked") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0,8.0)
                lineTo(19.0,5.0)
                curveTo(19.0,3.895430564880371,18.104570388793945,3.0,17.0,3.0)
                lineTo(7.0,3.0)
                curveTo(5.895430564880371,3.0,5.0,3.895430564880371,5.0,5.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,21.0)
                lineTo(10.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,16.0)
                lineTo(20.0,14.0)
                curveTo(19.995075225830078,12.898921966552734,19.101089477539062,12.00892448425293,18.0,12.00892448425293)
                curveTo(16.898910522460938,12.00892448425293,16.004924774169922,12.898921966552734,16.0,14.0)
                lineTo(16.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,16.0)
                lineTo(21.0,16.0)
                lineTo(22.0,16.0)
                lineTo(22.0,21.0)
                lineTo(21.0,21.0)
                lineTo(15.0,21.0)
                lineTo(14.0,21.0)
                lineTo(14.0,16.0)
                lineTo(15.0,16.0)
                close()
            }
}

public val LucideIcons.All.DoorClosedLockedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorClosedLocked: ImageVector
    @Composable get() = DoorClosedLockedDefinition.asImageVector()
