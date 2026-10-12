package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Banana") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0f,13.0f)
                curveTo(7.5f,11.0f,12.0f,11.0f,14.0f,15.0f)
                curveTo(15.721143f,14.121268f,17.777185f,14.210296f,19.415932f,15.23451f)
                curveTo(21.054676f,16.258726f,22.035664f,18.067842f,22.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.15f,17.89f)
                curveTo(10.67f,16.369999f,13.799999f,11.0f,12.15f,5.8899994f)
                curveTo(11.55f,4.0f,11.5f,2.0f,13.0f,2.0f)
                curveTo(16.22f,2.0f,18.0f,7.5f,18.0f,10.0f)
                curveTo(18.0f,16.5f,13.8f,22.0f,7.51f,22.0f)
                curveTo(5.11f,22.0f,2.0f,22.0f,2.0f,20.0f)
                curveTo(2.0f,18.5f,3.1399999f,18.45f,5.15f,17.89f)
                close()
            }
}

public val LucideIcons.All.BananaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Banana: ImageVector
    @Composable get() = BananaDefinition.asImageVector()
