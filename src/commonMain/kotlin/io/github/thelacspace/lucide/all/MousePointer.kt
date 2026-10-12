package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.586f,12.586f)
                lineTo(19.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.688f,3.037f)
                curveTo(3.501736f,2.9585044f,3.2864866f,3.000634f,3.1435604f,3.1435604f)
                curveTo(3.000634f,3.2864866f,2.9585044f,3.501736f,3.037f,3.688f)
                lineTo(9.537f,19.687f)
                curveTo(9.6190405f,19.88546f,9.8184395f,20.009562f,10.032728f,19.995531f)
                curveTo(10.247018f,19.981503f,10.4285345f,19.832462f,10.483999f,19.625f)
                lineTo(12.0529995f,13.542f)
                curveTo(12.223196f,12.818155f,12.780922f,12.248489f,13.500999f,12.063f)
                lineTo(19.625f,10.483999f)
                curveTo(19.83354f,10.429855f,19.983946f,10.248214f,19.998247f,10.033234f)
                curveTo(20.012548f,9.818254f,19.887531f,9.61829f,19.688f,9.536999f)
                close()
            }
}

public val LucideIcons.All.MousePointerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer: ImageVector
    @Composable get() = MousePointerDefinition.asImageVector()
