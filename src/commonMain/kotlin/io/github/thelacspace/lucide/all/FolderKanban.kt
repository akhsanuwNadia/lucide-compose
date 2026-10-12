package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderKanban") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,20.0)
                lineTo(20.0,20.0)
                curveTo(21.104570388793945,20.0,22.0,19.104570388793945,22.0,18.0)
                lineTo(22.0,8.0)
                curveTo(22.0,6.895430564880371,21.104570388793945,6.0,20.0,6.0)
                lineTo(12.069999694824219,6.0)
                curveTo(11.400961875915527,5.9965386390686035,10.777966499328613,5.6587700843811035,10.40999984741211,5.099999904632568)
                lineTo(9.59000015258789,3.8999998569488525)
                curveTo(9.222033500671387,3.3412294387817383,8.599038124084473,3.0034611225128174,7.929999828338623,3.0)
                lineTo(4.0,3.0)
                curveTo(2.895430564880371,3.0,2.0,3.895430564880371,2.0,5.0)
                lineTo(2.0,18.0)
                curveTo(2.0,19.100000381469727,2.9000000953674316,20.0,4.0,20.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,10.0)
                lineTo(8.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,10.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(16.0,16.0)
            }
}

public val LucideIcons.All.FolderKanbanDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderKanban: ImageVector
    @Composable get() = FolderKanbanDefinition.asImageVector()
