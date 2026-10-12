package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Headphones") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0f,14.0f)
                lineTo(6.0f,14.0f)
                curveTo(7.1045694f,14.0f,8.0f,14.895431f,8.0f,16.0f)
                lineTo(8.0f,19.0f)
                curveTo(8.0f,20.10457f,7.1045694f,21.0f,6.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,12.0f)
                curveTo(3.0221589f,7.0451484f,7.045099f,3.0401592f,12.0f,3.0401592f)
                curveTo(16.9549f,3.0401592f,20.97784f,7.0451484f,21.0f,12.0f)
                lineTo(21.0f,19.0f)
                curveTo(21.0f,20.10457f,20.10457f,21.0f,19.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(16.89543f,21.0f,16.0f,20.10457f,16.0f,19.0f)
                lineTo(16.0f,16.0f)
                curveTo(16.0f,14.895431f,16.89543f,14.0f,18.0f,14.0f)
                lineTo(21.0f,14.0f)
            }
}

public val LucideIcons.All.HeadphonesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Headphones: ImageVector
    @Composable get() = HeadphonesDefinition.asImageVector()
