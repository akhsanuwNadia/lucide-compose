package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StickyNotes") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                curveTo(10.640057563781738,7.998430252075195,11.254226684570312,8.252593994140625,11.706000328063965,8.706000328063965)
                lineTo(15.294000625610352,12.294000625610352)
                curveTo(15.747406005859375,12.745774269104004,16.001569747924805,13.359942436218262,16.0,14.0)
                lineTo(16.0,20.0)
                curveTo(16.0,21.104570388793945,15.104569435119629,22.0,14.0,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,10.0)
                curveTo(2.0,8.895430564880371,2.895430564880371,8.0,4.0,8.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,8.0)
                lineTo(10.0,13.0)
                curveTo(10.0,13.552285194396973,10.447714805603027,14.0,11.0,14.0)
                lineTo(16.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,4.0)
                curveTo(8.0,2.895430564880371,8.895430564880371,2.0,10.0,2.0)
                lineTo(16.0,2.0)
                curveTo(16.640058517456055,1.9984304904937744,17.254226684570312,2.252593994140625,17.70599937438965,2.7059998512268066)
                lineTo(21.29399871826172,6.293999671936035)
                curveTo(21.747406005859375,6.7457733154296875,22.001569747924805,7.3599419593811035,22.0,8.0)
                lineTo(22.0,14.0)
                curveTo(22.0,15.104569435119629,21.104570388793945,16.0,20.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,7.0)
                curveTo(16.0,7.5522847175598145,16.447715759277344,8.0,17.0,8.0)
                lineTo(22.0,8.0)
            }
}

public val LucideIcons.All.StickyNotesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StickyNotes: ImageVector
    @Composable get() = StickyNotesDefinition.asImageVector()
