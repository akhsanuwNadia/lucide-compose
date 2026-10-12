package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Lock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,11.0f)
                lineTo(19.0f,11.0f)
                curveTo(20.10457f,11.0f,21.0f,11.895431f,21.0f,13.0f)
                lineTo(21.0f,20.0f)
                curveTo(21.0f,21.10457f,20.10457f,22.0f,19.0f,22.0f)
                lineTo(5.0f,22.0f)
                curveTo(3.8954306f,22.0f,3.0f,21.10457f,3.0f,20.0f)
                lineTo(3.0f,13.0f)
                curveTo(3.0f,11.895431f,3.8954306f,11.0f,5.0f,11.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,11.0f)
                lineTo(7.0f,7.0f)
                curveTo(7.0123105f,4.2473044f,9.247277f,2.0223107f,12.0f,2.0223107f)
                curveTo(14.752723f,2.0223107f,16.98769f,4.2473044f,17.0f,7.0f)
                lineTo(17.0f,11.0f)
            }
}

public val LucideIcons.All.LockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Lock: ImageVector
    @Composable get() = LockDefinition.asImageVector()
