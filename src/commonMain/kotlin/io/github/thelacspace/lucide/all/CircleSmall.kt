package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleSmall") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                curveTo(5.990385f,14.149985f,7.131871f,16.140781f,8.992228f,17.21856f)
                curveTo(10.852584f,18.296337f,13.147416f,18.296337f,15.007772f,17.21856f)
                curveTo(16.86813f,16.140781f,18.009615f,14.149985f,18.0f,12.0f)
                curveTo(18.009615f,9.850015f,16.86813f,7.8592186f,15.007772f,6.7814407f)
                curveTo(13.147416f,5.7036624f,10.852584f,5.7036624f,8.992228f,6.7814407f)
                curveTo(7.131871f,7.8592186f,5.990385f,9.850015f,6.0f,12.0f)
            }
}

public val LucideIcons.All.CircleSmallDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleSmall: ImageVector
    @Composable get() = CircleSmallDefinition.asImageVector()
