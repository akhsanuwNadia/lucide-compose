package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sigma") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.0f,7.0f)
                lineTo(18.0f,5.0f)
                curveTo(18.0f,4.4477153f,17.552284f,4.0f,17.0f,4.0f)
                lineTo(6.5f,4.0f)
                curveTo(6.310614f,4.0f,6.137482f,4.1070013f,6.0527864f,4.2763934f)
                curveTo(5.96809f,4.4457855f,5.986368f,4.6484914f,6.1f,4.8f)
                lineTo(10.6f,10.8f)
                curveTo(11.133334f,11.511111f,11.133334f,12.48889f,10.6f,13.200001f)
                lineTo(6.1000004f,19.2f)
                curveTo(5.986369f,19.35151f,5.9680915f,19.554214f,6.0527873f,19.723606f)
                curveTo(6.1374836f,19.893f,6.3106146f,20.0f,6.5000005f,20.0f)
                lineTo(17.0f,20.0f)
                curveTo(17.552284f,20.0f,18.0f,19.552284f,18.0f,19.0f)
                lineTo(18.0f,17.0f)
            }
}

public val LucideIcons.All.SigmaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sigma: ImageVector
    @Composable get() = SigmaDefinition.asImageVector()
