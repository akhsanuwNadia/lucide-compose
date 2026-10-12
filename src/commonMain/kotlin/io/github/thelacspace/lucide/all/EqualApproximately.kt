package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EqualApproximately") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,15.0f)
                curveTo(7.1340823f,13.636301f,9.865917f,13.636301f,12.0f,15.0f)
                curveTo(14.134083f,16.363699f,16.865917f,16.363699f,19.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,9.0f)
                curveTo(7.1340823f,7.6363006f,9.865917f,7.6363006f,12.0f,9.0f)
                curveTo(14.134083f,10.363699f,16.865917f,10.363699f,19.0f,9.0f)
            }
}

public val LucideIcons.All.EqualApproximatelyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EqualApproximately: ImageVector
    @Composable get() = EqualApproximatelyDefinition.asImageVector()
