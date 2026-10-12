package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Watch") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,10.0f)
                lineTo(12.0f,12.2f)
                lineTo(13.6f,13.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.13f,7.66f)
                lineTo(15.319999f,3.6099997f)
                curveTo(15.131262f,2.659768f,14.288615f,1.9814373f,13.319999f,1.9999996f)
                lineTo(10.639998f,1.9999996f)
                curveTo(9.671382f,1.9814373f,8.828735f,2.659768f,8.639998f,3.6099997f)
                lineTo(7.8599987f,7.66f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.88f,16.36f)
                lineTo(8.68f,20.36f)
                curveTo(8.868737f,21.310232f,9.711384f,21.988564f,10.68f,21.970001f)
                lineTo(13.400001f,21.970001f)
                curveTo(14.368617f,21.988564f,15.211264f,21.310232f,15.400001f,20.36f)
                lineTo(16.210001f,16.310001f)
            }
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

public val LucideIcons.All.WatchDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Watch: ImageVector
    @Composable get() = WatchDefinition.asImageVector()
