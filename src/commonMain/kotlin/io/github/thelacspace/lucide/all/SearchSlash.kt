package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SearchSlash") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.5f,8.5f)
                lineTo(8.5f,13.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,11.0f)
                curveTo(2.98718f,13.866648f,4.5091615f,16.521042f,6.9896364f,17.958078f)
                curveTo(9.470112f,19.395117f,12.529888f,19.395117f,15.010364f,17.958078f)
                curveTo(17.490839f,16.521042f,19.01282f,13.866648f,19.0f,11.0f)
                curveTo(19.01282f,8.133352f,17.490839f,5.478958f,15.010364f,4.0419207f)
                curveTo(12.529888f,2.6048834f,9.470112f,2.6048834f,6.9896364f,4.0419207f)
                curveTo(4.5091615f,5.478958f,2.98718f,8.133352f,3.0f,11.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,21.0f)
                lineTo(16.7f,16.7f)
            }
}

public val LucideIcons.All.SearchSlashDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SearchSlash: ImageVector
    @Composable get() = SearchSlashDefinition.asImageVector()
