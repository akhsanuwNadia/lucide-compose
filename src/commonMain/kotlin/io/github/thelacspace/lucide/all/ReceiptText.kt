package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ReceiptText") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,16.0f)
                lineTo(8.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,8.0f)
                lineTo(8.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,12.0f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,3.0f)
                curveTo(4.0f,2.4477153f,4.4477153f,2.0f,5.0f,2.0f)
                curveTo(5.247619f,1.9986384f,5.4904766f,2.0680263f,5.7f,2.2f)
                lineTo(6.633f,2.8000002f)
                curveTo(7.0598164f,3.07274f,7.6061835f,3.07274f,8.033f,2.8000002f)
                lineTo(8.967f,2.2000003f)
                curveTo(9.393816f,1.9272606f,9.940184f,1.9272606f,10.367f,2.2000003f)
                lineTo(11.299999f,2.8000002f)
                curveTo(11.726815f,3.0727398f,12.273183f,3.0727398f,12.699999f,2.8000002f)
                lineTo(13.632998f,2.2000003f)
                curveTo(14.059814f,1.9272606f,14.606182f,1.9272606f,15.032998f,2.2000003f)
                lineTo(15.966998f,2.8000002f)
                curveTo(16.393814f,3.0727403f,16.940182f,3.0727403f,17.366999f,2.8000002f)
                lineTo(18.3f,2.2000003f)
                curveTo(18.509523f,2.0680263f,18.75238f,1.9986383f,19.0f,2.0f)
                curveTo(19.552284f,2.0f,20.0f,2.4477153f,20.0f,3.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                curveTo(18.75238f,22.001362f,18.509523f,21.931973f,18.3f,21.8f)
                lineTo(17.366999f,21.199999f)
                curveTo(16.940182f,20.92726f,16.393816f,20.92726f,15.966999f,21.199999f)
                lineTo(15.032999f,21.8f)
                curveTo(14.606183f,22.072739f,14.059815f,22.072739f,13.632999f,21.8f)
                lineTo(12.7f,21.199999f)
                curveTo(12.273184f,20.92726f,11.726816f,20.92726f,11.3f,21.199999f)
                lineTo(10.367001f,21.8f)
                curveTo(9.940185f,22.072739f,9.393817f,22.072739f,8.967001f,21.8f)
                lineTo(8.033001f,21.199999f)
                curveTo(7.6061845f,20.92726f,7.0598173f,20.92726f,6.633001f,21.199999f)
                lineTo(5.700001f,21.8f)
                curveTo(5.4904776f,21.931973f,5.24762f,22.001362f,5.000001f,22.0f)
                curveTo(4.447716f,22.0f,4.000001f,21.552284f,4.000001f,21.0f)
                close()
            }
}

public val LucideIcons.All.ReceiptTextDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ReceiptText: ImageVector
    @Composable get() = ReceiptTextDefinition.asImageVector()
