package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacTaurus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6.0f,15.0f)
                curveTo(5.990385f,17.149986f,7.131871f,19.140781f,8.992228f,20.21856f)
                curveTo(10.852584f,21.296337f,13.147416f,21.296337f,15.007772f,20.21856f)
                curveTo(16.86813f,19.140781f,18.009615f,17.149986f,18.0f,15.0f)
                curveTo(18.009615f,12.850015f,16.86813f,10.859219f,15.007772f,9.781441f)
                curveTo(13.147416f,8.703663f,10.852584f,8.703663f,8.992228f,9.781441f)
                curveTo(7.131871f,10.859219f,5.990385f,12.850015f,6.0f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,3.0f)
                curveTo(17.985228f,6.3032346f,15.3032675f,8.9732275f,12.0f,8.9732275f)
                curveTo(8.6967325f,8.9732275f,6.0147724f,6.3032346f,6.0f,3.0f)
            }
}

public val LucideIcons.All.ZodiacTaurusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacTaurus: ImageVector
    @Composable get() = ZodiacTaurusDefinition.asImageVector()
