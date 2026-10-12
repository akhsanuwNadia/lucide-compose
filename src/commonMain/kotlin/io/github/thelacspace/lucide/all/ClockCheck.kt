package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClockCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.950000762939453,13.0)
                curveTo(22.375070571899414,8.7692289352417,20.07822036743164,4.732311725616455,16.224105834960938,2.936232089996338)
                curveTo(12.369990348815918,1.1401523351669312,7.801546573638916,1.9777321815490723,4.8352766036987305,5.024263381958008)
                curveTo(1.869006872177124,8.070795059204102,1.1536670923233032,12.659967422485352,3.0519816875457764,16.46476936340332)
                curveTo(4.950296401977539,20.269569396972656,9.047082901000977,22.457847595214844,13.265000343322754,21.920000076293945)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,6.0)
                lineTo(12.0,12.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,19.0)
                lineTo(18.0,21.0)
                lineTo(22.0,17.0)
            }
}

public val LucideIcons.All.ClockCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClockCheck: ImageVector
    @Composable get() = ClockCheckDefinition.asImageVector()
