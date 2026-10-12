package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DatabaseZap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(2.9886975288391113,19.9759464263916,4.402307987213135,20.892728805541992,6.78963565826416,21.45772933959961)
                curveTo(9.176962852478027,22.022729873657227,12.239594459533691,22.165325164794922,15.0,21.84000015258789)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,5.0)
                lineTo(21.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,12.0)
                lineTo(18.0,17.0)
                lineTo(22.0,17.0)
                lineTo(19.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                curveTo(3.0029306411743164,12.948010444641113,4.349961757659912,13.839777946472168,6.632964611053467,14.405112266540527)
                curveTo(8.915966987609863,14.97044563293457,11.866278648376465,15.142816543579102,14.59000015258789,14.869999885559082)
            }
}

public val LucideIcons.All.DatabaseZapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DatabaseZap: ImageVector
    @Composable get() = DatabaseZapDefinition.asImageVector()
