package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Section") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                curveTo(15.990151f,3.3483827f,14.202178f,2.0133865f,12.0f,2.0133865f)
                curveTo(9.797822f,2.0133865f,8.009849f,3.3483827f,8.0f,5.0f)
                curveTo(8.0f,9.0f,16.0f,8.0f,16.0f,12.0f)
                curveTo(15.990151f,13.651617f,14.202178f,14.986613f,12.0f,14.986613f)
                curveTo(9.797822f,14.986613f,8.009849f,13.651617f,8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,19.0f)
                curveTo(8.009849f,20.651617f,9.797822f,21.986614f,12.0f,21.986614f)
                curveTo(14.202178f,21.986614f,15.990151f,20.651617f,16.0f,19.0f)
                curveTo(16.0f,15.0f,8.0f,16.0f,8.0f,12.0f)
                curveTo(8.009849f,10.348383f,9.797822f,9.013387f,12.0f,9.013387f)
                curveTo(14.202178f,9.013387f,15.990151f,10.348383f,16.0f,12.0f)
            }
}

public val LucideIcons.All.SectionDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Section: ImageVector
    @Composable get() = SectionDefinition.asImageVector()
