package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceSlightlySmilingPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.267f,2.08f)
                curveTo(9.024554f,1.5383421f,4.9072766f,3.7546246f,3.0231636f,7.5941367f)
                curveTo(1.1390505f,11.433649f,1.905241f,16.046331f,4.929455f,19.070545f)
                curveTo(7.9536686f,22.094759f,12.566351f,22.860949f,16.405863f,20.976837f)
                curveTo(20.245375f,19.092724f,22.461658f,14.975446f,21.92f,10.733f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,10.0f)
                lineTo(15.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,5.0f)
                lineTo(22.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.472f,15.0f)
                curveTo(15.33377f,16.272173f,13.707541f,16.999289f,12.0005f,16.999289f)
                curveTo(10.293459f,16.999289f,8.667231f,16.272173f,7.5290003f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0f,2.0f)
                lineTo(19.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(9.0f,9.0f)
            }
}

public val LucideIcons.All.FaceSlightlySmilingPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceSlightlySmilingPlus: ImageVector
    @Composable get() = FaceSlightlySmilingPlusDefinition.asImageVector()
