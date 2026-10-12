package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNoteOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,3.0)
                lineTo(15.0,8.0)
                curveTo(15.0,8.552285194396973,15.447714805603027,9.0,16.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.5859999656677246,3.5859999656677246)
                curveTo(3.2109012603759766,3.9609854221343994,3.0001132488250732,4.469610214233398,3.0,5.0)
                lineTo(3.0,19.0)
                curveTo(3.0,20.104570388793945,3.895430564880371,21.0,5.0,21.0)
                lineTo(19.0,21.0)
                curveTo(19.5303897857666,20.99988555908203,20.03901481628418,20.789098739624023,20.413999557495117,20.413999557495117)
            }
            lucidePath(strokeWidth) {
                moveTo(8.656000137329102,3.0)
                lineTo(15.0,3.0)
                curveTo(15.640057563781738,2.9984304904937744,16.254226684570312,3.252593994140625,16.70599937438965,3.7059998512268066)
                lineTo(20.29399871826172,7.293999671936035)
                curveTo(20.747406005859375,7.7457733154296875,21.001569747924805,8.359941482543945,21.0,9.0)
                lineTo(21.0,15.343999862670898)
            }
}

public val LucideIcons.All.StickyNoteOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNoteOff: ImageVector
    @Composable get() = StickyNoteOffDefinition.asImageVector()
