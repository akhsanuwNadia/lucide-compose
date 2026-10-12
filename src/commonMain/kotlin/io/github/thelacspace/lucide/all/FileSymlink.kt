package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileSymlink") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,11.0)
                lineTo(4.0,4.0)
                curveTo(4.0,2.895430564880371,4.895430564880371,2.0,6.0,2.0)
                lineTo(14.0,2.0)
                curveTo(14.640057563781738,1.9984302520751953,15.254226684570312,2.252593755722046,15.706000328063965,2.7059998512268066)
                lineTo(19.29400062561035,6.293999671936035)
                curveTo(19.747406005859375,6.7457733154296875,20.001569747924805,7.3599419593811035,20.0,8.0)
                lineTo(20.0,20.0)
                curveTo(20.0,21.104570388793945,19.104570388793945,22.0,18.0,22.0)
                lineTo(6.0,22.0)
                curveTo(4.895430564880371,22.0,4.0,21.104570388793945,4.0,20.0)
                lineTo(4.0,17.0)
                curveTo(4.0,15.895430564880371,4.895430564880371,15.0,6.0,15.0)
                lineTo(13.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,2.0)
                lineTo(14.0,7.0)
                curveTo(14.0,7.5522847175598145,14.447714805603027,8.0,15.0,8.0)
                lineTo(20.0,8.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,18.0)
                lineTo(13.0,15.0)
                lineTo(10.0,12.0)
            }
}

public val LucideIcons.All.FileSymlinkDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileSymlink: ImageVector
    @Composable get() = FileSymlinkDefinition.asImageVector()
