package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LibraryBig") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                lineTo(10.0f,3.0f)
                lineTo(11.0f,3.0f)
                lineTo(11.0f,21.0f)
                lineTo(10.0f,21.0f)
                lineTo(4.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(4.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.4f,18.9f)
                curveTo(20.6f,19.4f,20.3f,20.0f,19.8f,20.199999f)
                lineTo(17.9f,20.9f)
                curveTo(17.4f,21.1f,16.8f,20.8f,16.6f,20.3f)
                lineTo(11.1f,5.1f)
                curveTo(10.900001f,4.6f,11.200001f,4.0f,11.700001f,3.8f)
                lineTo(13.6f,3.1f)
                curveTo(14.1f,2.8999999f,14.700001f,3.1999998f,14.900001f,3.6999998f)
                close()
            }
}

public val LucideIcons.All.LibraryBigDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LibraryBig: ImageVector
    @Composable get() = LibraryBigDefinition.asImageVector()
